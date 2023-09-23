<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jogo</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <style>

        .img{
            border-radius:10%;
        }

        body{
            color: white;
        }

        #container{
            background-color:#27329D;
            border: 2px solid #27329D;
            border-radius: 10%;
            width: 900px;
        
        }

    </style>
</head>
<body class="text-center">
    <div class= "container mt-4" id="container"> 
    <?php
     if (isset($_GET['personagem'])) { 
        $personagem = $_GET['personagem'];

        if($personagem == 'heroi'){
            ?>
            <img src="img/sonic-banner.png" alt="Imagem do Personagem" class="img">

            <?php

            echo "<h2>Você escolheu Sonic!</h2>";
            echo "<p>Se prepare para derrotar eggman e assim ajudar a libertar os animais da floresta!</p>";
            $mensagem = file_get_contents("heroi.txt");
            
        } else if($personagem == 'vilao'){
            ?>
            <img src="img/eggman-banner.png" alt="Imagem do Personagem" class="img">

            <?php
            echo "<h2>Você escolheu o Dr.Eggman!</h2>";
            echo "<p> Prepare-se para construir seu exército e dominar o mundo</p>";
            $mensagem = file_get_contents("vilao.txt");
        } else{
            echo "<p>Personagem não reconhecido</p>";
        }

        echo $mensagem;
    }
    ?>
    </div>

</body>
</html>


