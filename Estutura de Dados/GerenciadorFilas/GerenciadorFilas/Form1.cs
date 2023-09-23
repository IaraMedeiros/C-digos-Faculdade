using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Linq.Expressions;
using System.Net.NetworkInformation;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GerenciadorFilas
{
    public partial class Form1 : Form
    {
        public static int senhaGeral = 1;
        public static int senhaPreferencial = 1;
        public static Queue<String> filaGeral = new Queue<String>();
        public static Queue<String> filaPreferencial = new Queue<String>();
        public static List<String> filaElementos = new List<string>();
        public enum TipoSenha
        {
            Geral,
            Preferencial,
        }

        public String pegarSenha(Queue<String> fila, TipoSenha tipo) {
            String id = tipo == TipoSenha.Geral ? "G" : "P";
            int senha = tipo == TipoSenha.Geral ? senhaGeral : senhaPreferencial;

            String novaSenha = id + senha;
            fila.Enqueue(novaSenha);

            if (tipo == TipoSenha.Geral)
            {
                senhaGeral++;
            }
            else {
                senhaPreferencial++;
            }

            return novaSenha;

        }

        public Form1()
        {

            InitializeComponent();
        }

        private void atualizarCadastro() {
            listaSenhas.Clear();

            foreach(string senha in filaElementos)
            {
                listaSenhas.Text += (senha + Environment.NewLine);
            }
        }

        private void verificarLotacao() {

            int numElementos = filaElementos.Count;
            lblNum.Text = "" + numElementos;


            if (numElementos == 12) {
                BotaoGeral.Enabled = false;
                BotaoPreferencial.Enabled = false;
                lblAviso.Visible = true;
            }
            else
            {
                BotaoGeral.Enabled = true;
                BotaoPreferencial.Enabled = true;
                lblAviso.Visible = false;
            }
        }

        private void BotaoGeral_Click(object sender, EventArgs e)
        {
            String novaSenha = pegarSenha(filaGeral, TipoSenha.Geral);
            filaElementos.Add(novaSenha);
            atualizarCadastro();
            verificarLotacao();



        }

        private void BotaoPreferencial_Click(object sender, EventArgs e)
        {
            String novaSenha = pegarSenha(filaPreferencial, TipoSenha.Preferencial);
            filaElementos.Add(novaSenha);
            atualizarCadastro();
            verificarLotacao();
        }

        private void BtnChamarG_Click(object sender, EventArgs e)
        {
            String senhaRetirada = filaGeral.Peek();
            filaGeral.Dequeue();
            filaElementos.Remove(senhaRetirada);
            atualizarCadastro();
            verificarLotacao();
        }

        private void btnChamarP_Click(object sender, EventArgs e)
        {
            String senhaRetirada = filaPreferencial.Peek();
            filaPreferencial.Dequeue();
            filaElementos.Remove(senhaRetirada);
            atualizarCadastro();
            verificarLotacao();
        }
    }
}
