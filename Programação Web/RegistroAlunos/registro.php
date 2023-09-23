<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nome = $_POST["nome"];
    $sobrenome = $_POST["sobrenome"];
    $idade = $_POST["idade"];
    $nota = $_POST["nota"];
    $sexo = $_POST["sexo"];
    $ID = rand(100, 999);

    $quantAlunos = 0;



    if($nota > 0 && $nota <= 10){
        if($idade > 0 && $idade <= 99 ){
            $dados = $nome . " " . $sobrenome . ", " . $ID . ", " . $idade . "," . $sexo . ", nota: " . $nota . PHP_EOL;

            $arquivo = fopen("registro.txt", "a");
            fwrite($arquivo, $dados);
            fclose($arquivo);
            echo "Dados cadastrados com sucesso!";
        } else{
            echo "insira uma idade válida, entre 0 e 99";
        } 
    } else{
        echo "insira uma nota válida, entre 0 e 10";
    }
}
?>


<br>
<html>
    <body>
    <a href="index.php" class="btn btn-primary">Voltar</a>
    </body>
</html>

