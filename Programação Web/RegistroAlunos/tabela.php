<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Tabela de Alunos</title>

</head>
<body>
    <h2>Lista de Alunos</h2>
    <table class="table table-striped">
        <thead>
            <tr>
                <th>Nome Completo</th>
                <th>ID</th>
                <th>Idade</th>
                <th>Sexo</th>
                <th>Nota</th>
            </tr>
        </thead>
        <tbody>
            <?php
            $feminino = 0;
            $masculino = 0;
            $quantAlunos = 0;

            $linhas = file("registro.txt");
            foreach ($linhas as $linha) {
                $campos = explode(",", $linha);
                echo "<tr>";
                foreach ($campos as $campo) {
                    echo "<td>" . trim($campo) . "</td>";
                    if($campo == 'masculino'){
                        $masculino++;
                    } else if ($campo == 'feminino'){
                        $feminino++;
                    }
                }
                echo "</tr>";
            }
            
            $quantAlunos = 0;

            foreach($linhas as $linhas ){
                $quantAlunos++;
            }

            ?>
        </tbody>
    </table>
    <br>
    <h2>Informações Adicionais:</h2>
    <h4>Quantidade de Alunos</h4>
    <?php echo "A quantidade de alunos cadastrados é de: " . $quantAlunos;?>
    <br><br>
    <h4>Sexo dos Alunos</h4>
    <?php echo "A quantidade de alunos masculinos cadastrados é de: " . $masculino;?>
    <br>
    <?php echo "A quantidade de alunos femininos cadastrados é de: " . $feminino;?>
    <br>
    <br>

    <a href="index.php" class="btn btn-primary">Voltar</a>
</body>
</html>
