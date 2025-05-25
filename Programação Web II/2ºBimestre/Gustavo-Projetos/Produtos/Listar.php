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
        <h3 class="text-center">Produtos Cadastrados</h3>
        <table class="table table-striped mt-4">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Estoque</th>
                </tr>
            </thead>
            <tbody>
                <?php foreach ($registros as $prod): ?>
                <tr>
                    <td><?= $prod['id'] ?></td>
                    <td><?= $prod['nome'] ?></td>
                    <td><?= $prod['estoque'] ?></td>
                </tr>
                <?php endforeach; ?>
            </tbody>
        </table>
        <a href="menu.php" class="btn btn-primary">Voltar ao Menu</a>
    </div>
</body>
</html>