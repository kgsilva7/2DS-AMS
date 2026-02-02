<?php
include_once 'Conectar.php';
include_once 'Produto.php';
$produto = new Produto();
$registros = $produto->listar();
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Lista de Produtos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <center><font face="Century Gothic" size="6"><b>Produtos Cadastrados</b></font></center>
    <br>
    <div class="card">
        <div class="card-header bg-info text-white">
            <b>Lista de Produtos</b>
        </div>
        <div class="card-body">
            <table class="table table-striped table-hover">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Estoque</th>
                    </tr>
                </thead>
                <tbody>
                    <?php foreach ($registros as $prod): ?>
                    <tr>
                        <td><b><?= $prod['id'] ?></b></td>
                        <td><?= $prod['nome'] ?></td>
                        <td><?= $prod['estoque'] ?></td>
                    </tr>
                    <?php endforeach; ?>
                </tbody>
            </table>
        </div>
    </div>   
    <center class="mt-4">
        <a href="Menu.php" class="btn btn-primary">Voltar ao Menu</a>
    </center>
</div>
</body>
</html>