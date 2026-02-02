<?php
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Menu de opções- Produtos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .text-center{
            font-size: 3rem;
            font-weight: bold;
        }
        .list-group-item {
            font-weight: bold;
            font-size: 1.1rem;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">PRODUTOS</h2>
        
        <div class="card mt-4">
            <div class="card-header bg-info text-white">
                <b>Produtos:</b>
            </div>
            <div class="list-group list-group-flush">
                <a href="Listar.php" class="list-group-item list-group-item-action">Listar Produtos</a>
                <a href="Cadastrar.php" class="list-group-item list-group-item-action">Cadastrar Produtos</a>
                <a href="Consultar.php" class="list-group-item list-group-item-action">Consultar Produtos</a>
                <a href="Excluir.php" class="list-group-item list-group-item-action">Excluir Produtos</a>
                <a href="Alterar.php" class="list-group-item list-group-item-action">Alterar Produtos</a>
            </div>
        </div>       
        <center class="mt-4">
            <a href="Login.php" class="btn btn-warning">Sair</a>
        </center>
    </div> 
    <footer class="mt-5">
        <div class="container">
            <center><h5>Desenvolvido por Gustavo Alexandre da Silva</h5></center>
        </div>
    </footer>
</body>
</html>