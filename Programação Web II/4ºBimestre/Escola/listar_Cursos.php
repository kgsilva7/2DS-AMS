<?php
include_once 'Cursos.php';
$curso = new Cursos();
$cursos = $curso->listar();
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Lista de Cursos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <center><font face="Century Gothic" size="6"><b>Lista de Cursos</b></font></center>
    <br>
    <div class="card">
        <div class="card-header bg-info text-white">
            <b>Cursos Cadastrados</b>
        </div>
        <div class="card-body">
            <table class="table table-striped table-hover">
                <thead class="table-dark">
                    <tr>
                        <th>Código</th>
                        <th>Nome</th>
                        <th>Disciplina 1</th>
                        <th>Disciplina 2</th>
                        <th>Disciplina 3</th>
                    </tr>
                </thead>
                <tbody>
                    <?php foreach ($cursos as $c): ?>
                    <tr>
                        <td><b><?= $c['codcurso'] ?></b></td>
                        <td><?= $c['nome'] ?></td>
                        <td><?= $c['coddisc1'] ?></td>
                        <td><?= $c['coddisc2'] ?></td>
                        <td><?= $c['coddisc3'] ?></td>
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
</