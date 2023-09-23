<!DOCTYPE html>
<html>
<head>
    <title>Seleção de Personagem</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body style="height: 100vh;">

    <div class="container mt-4">
            <h2 class="txt-choice ">Escolha o seu personagem:</h2>

        <div class="float-container">

            <div class="float-child">
            <a href="personagem.php?personagem=heroi" class="btn btn-primary">Herói</a>
            <img src="img/sonic.png" alt="" class="sonic">
            </div>

            <div class="float-child">
            <a href="personagem.php?personagem=vilao" class="btn btn-danger">Vilão</a>
            <img src="img/eggman.png" alt="" class="eggman">
            </div>

        </div>

    </div>


    <style>

    .eggman{
        float: right;
        width: 300px;
    }

    .sonic
    {
        margin-left: 15px;
        margin-top: 15px;
        width: 150px;
    }

    a{
        margin-left: 25%;
    }

    .float-child {
        margin-top: 5%;
        height: 300px;
        width: 50%;
        float: left;
        padding: 20px;

    }  
                
     .txt-choice{
        margin-top: 10%;
        margin-left: 10%;
     }  

    .container{
        background-color: #F6CB13 ;
        border: solid 2px #F6CB13;
        width: 640px;
        height: 600px;
        border-radius: 10%;
    }

    .imagem{
        border-radius: 10%;
    }

    .content-box{
        margin: 5%;
    }

    </style>

</body>
</html>
