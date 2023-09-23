<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        .form {
            background-color: #f5f5f5; 
            padding: 20px; 
            border-radius: 10px; 
            margin: 0 auto; 
            width: 300px; 
        }
        body{
            background-color: #C8FFF5;
        }
    </style>
    <title>Document</title>
</head>
<body>
    <div class="container mt-5">
        <div class="form">
            <form action="registro.php" method="post">
                <div class="form-group">
                    <label for="nome">Nome</label>
                    <input type="text" class="form-control" id="nome" placeholder="Nome" name="nome" required>
                </div>
                <div class="form-group">
                    <label for="sobrenome">Sobrenome</label>
                    <input type="text" class="form-control" id="sobrenome" placeholder="Sobrenome" name="sobrenome" required>
                </div>
                <div class="form-group">
                    <label for="idade">Idade</label>
                    <input type="number" class="form-control" id="idade" name="idade" required>
                </div>
                <div class="form-group">
                    <label for="nota">Nota</label>
                    <input type="number" class="form-control" id="nota" name="nota" required>
                </div>
                <div class="form-group">
                  <label for="sexo">Sexo</label><br>
                  <div class="form-check">
                      <input type="radio" class="form-check-input" id="masculino" name="sexo" value="masculino" required>
                      <label class="form-check-label" for="masculino">Masculino</label>
                  </div>
                  <div class="form-check">
                      <input type="radio" class="form-check-input" id="feminino" name="sexo" value="feminino" required>
                      <label class="form-check-label" for="feminino">Feminino</label>
                  </div>
              </div>
                <button type="submit" class="btn btn-primary">Cadastrar</button><br><br>
                <a href="tabela.php" class="btn btn-primary">Ver lista de alunos</a>
            </form>
        </div>
    </div>
</body>
</html>
