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
    <center><font face="Century Gothic" size="6"><b>Lista de Alunos</b></font></center>
    <br>  
    <div class="card">
        <div class="card-header bg-info text-white">
            <b>Alunos Cadastrados</b>
        </div>
        <div class="card-body">
            <table class="table table-striped table-hover">
                <thead class="table-dark">
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
                        <td><b><?= $a['matricula'] ?></b></td>
                        <td><?= $a['nome'] ?></td>
                        <td><?= $a['endereco'] ?></td>
                        <td><?= $a['cidade'] ?></td>
                        <td><?= $a['codcurso'] ?></td>
                    </tr>
                    <?php endforeach; ?>
                </tbody>
            </table>
        </div>
    </div>
    <center class="mt-4">
        <a href="menu.php" class="btn btn-primary">Voltar ao Menu</a>
    </center>
</div>
</body>
</html>