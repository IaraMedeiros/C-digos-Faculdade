namespace GerenciadorFilas
{
    partial class Form1
    {
        /// <summary>
        /// Variável de designer necessária.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpar os recursos que estão sendo usados.
        /// </summary>
        /// <param name="disposing">true se for necessário descartar os recursos gerenciados; caso contrário, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código gerado pelo Windows Form Designer

        /// <summary>
        /// Método necessário para suporte ao Designer - não modifique 
        /// o conteúdo deste método com o editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.BotaoPreferencial = new System.Windows.Forms.Button();
            this.BotaoGeral = new System.Windows.Forms.Button();
            this.listaSenhas = new System.Windows.Forms.TextBox();
            this.BtnChamarG = new System.Windows.Forms.Button();
            this.btnChamarP = new System.Windows.Forms.Button();
            this.lblAviso = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // BotaoPreferencial
            // 
            this.BotaoPreferencial.Location = new System.Drawing.Point(43, 170);
            this.BotaoPreferencial.Name = "BotaoPreferencial";
            this.BotaoPreferencial.Size = new System.Drawing.Size(152, 56);
            this.BotaoPreferencial.TabIndex = 2;
            this.BotaoPreferencial.Text = "Pegar senha preferencial";
            this.BotaoPreferencial.UseVisualStyleBackColor = true;
            this.BotaoPreferencial.Click += new System.EventHandler(this.BotaoPreferencial_Click);
            // 
            // BotaoGeral
            // 
            this.BotaoGeral.Location = new System.Drawing.Point(43, 76);
            this.BotaoGeral.Name = "BotaoGeral";
            this.BotaoGeral.Size = new System.Drawing.Size(152, 54);
            this.BotaoGeral.TabIndex = 3;
            this.BotaoGeral.Text = "Pegar senha geral";
            this.BotaoGeral.UseVisualStyleBackColor = true;
            this.BotaoGeral.Click += new System.EventHandler(this.BotaoGeral_Click);
            // 
            // listaSenhas
            // 
            this.listaSenhas.Font = new System.Drawing.Font("Microsoft Sans Serif", 16F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.listaSenhas.Location = new System.Drawing.Point(248, 24);
            this.listaSenhas.Multiline = true;
            this.listaSenhas.Name = "listaSenhas";
            this.listaSenhas.ReadOnly = true;
            this.listaSenhas.Size = new System.Drawing.Size(241, 296);
            this.listaSenhas.TabIndex = 4;
            this.listaSenhas.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // BtnChamarG
            // 
            this.BtnChamarG.Location = new System.Drawing.Point(248, 347);
            this.BtnChamarG.Name = "BtnChamarG";
            this.BtnChamarG.Size = new System.Drawing.Size(102, 54);
            this.BtnChamarG.TabIndex = 6;
            this.BtnChamarG.Text = "Chamar Geral";
            this.BtnChamarG.UseVisualStyleBackColor = true;
            this.BtnChamarG.Click += new System.EventHandler(this.BtnChamarG_Click);
            // 
            // btnChamarP
            // 
            this.btnChamarP.Location = new System.Drawing.Point(387, 347);
            this.btnChamarP.Name = "btnChamarP";
            this.btnChamarP.Size = new System.Drawing.Size(102, 54);
            this.btnChamarP.TabIndex = 7;
            this.btnChamarP.Text = "Chamar Preferencial";
            this.btnChamarP.UseVisualStyleBackColor = true;
            this.btnChamarP.Click += new System.EventHandler(this.btnChamarP_Click);
            // 
            // lblAviso
            // 
            this.lblAviso.Font = new System.Drawing.Font("Microsoft Sans Serif", 11F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblAviso.ForeColor = System.Drawing.Color.Red;
            this.lblAviso.Location = new System.Drawing.Point(27, 266);
            this.lblAviso.Name = "lblAviso";
            this.lblAviso.Size = new System.Drawing.Size(168, 79);
            this.lblAviso.TabIndex = 8;
            this.lblAviso.Text = "Aviso! A fila está cheia! Espere alguma senha ser chamada para pegar a sua.";
            this.lblAviso.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            this.lblAviso.Visible = false;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(502, 422);
            this.Controls.Add(this.lblAviso);
            this.Controls.Add(this.btnChamarP);
            this.Controls.Add(this.BtnChamarG);
            this.Controls.Add(this.listaSenhas);
            this.Controls.Add(this.BotaoGeral);
            this.Controls.Add(this.BotaoPreferencial);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button BotaoPreferencial;
        private System.Windows.Forms.Button BotaoGeral;
        private System.Windows.Forms.TextBox listaSenhas;
        private System.Windows.Forms.Button BtnChamarG;
        private System.Windows.Forms.Button btnChamarP;
        private System.Windows.Forms.Label lblAviso;
    }
}

