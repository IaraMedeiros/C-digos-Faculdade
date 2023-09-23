 <!--
     Nome da dupla:
     Iara Medeiros Barros
     Mirela de Almeida Neder 
 -->

<!DOCTYPE html>
<html>
<head>
    <title>Autenticação</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body style="height: 100vh;">
    <div class="container mt-4"  >
        <div class="img-box">
        <img src="img/sonic-header.png" alt="" class="imagem">
        </div>

        <div class="content-box">
        <h2>Login</h2>
        <p>Bem vindo! Faça login para jogar.</p>
        
        <form method="post" action="" class="form">
            <label for="email">Digite seu email:</label>
            <input type="email"  name="email" required>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
        </div>

        <?php
         if ($_SERVER["REQUEST_METHOD"] === "POST") {
             $email = $_POST["email"];
             
             
             if ($email === "email@example.com") { 
                 header("Location: jogo.php");
                 exit();
             } else {
                 echo "Email incorreto. Tente novamente.";
             }
         }
         ?>  

    </div>



    <style>        
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

