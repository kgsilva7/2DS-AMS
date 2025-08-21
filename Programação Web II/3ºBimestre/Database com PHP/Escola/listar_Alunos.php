<?php
include_once 'Alunos.php';

$aluno = new Alunos();
$alunos = $aluno->listar();
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Lista de Alunos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center mb-4">Lista de Alunos</h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Matrícula</th>
                    <th>Nome</th>
                    <th>Endereço</th>
                    <th>Cidade</th>
                    <th>Cód. Curso</th>
                </tr>
            </thead>
            <tbody>
                <?php foreach ($alunos as $a): ?>
                <tr>
                    <td><?= $a['matricula'] ?></td>
                    <td><?= $a['nome'] ?></td>
                    <td><?= $a['endereco'] ?></td>
                    <td><?= $a['cidade'] ?></td>
                    <td><?= $a['codcurso'] ?></td>
                </tr>
                <?php endforeach; ?>
            </tbody>
        </table>
        <a href="menu.php" class="btn btn-primary mt-3">Voltar ao Menu</a>
    </div>
</body>
</html>