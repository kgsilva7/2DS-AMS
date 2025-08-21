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
        <h2 class="text-center mb-4">Lista de Cursos</h2>
        <table class="table table-striped">
            <thead>
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
                    <td><?= $c['codcurso'] ?></td>
                    <td><?= $c['nome'] ?></td>
                    <td><?= $c['coddisc1'] ?></td>
                    <td><?= $c['coddisc2'] ?></td>
                    <td><?= $c['coddisc3'] ?></td>
                </tr>
                <?php endforeach; ?>
            </tbody>
        </table>
        <a href="menu.php" class="btn btn-primary mt-3">Voltar ao Menu</a>
    </div>
</body>
</html>