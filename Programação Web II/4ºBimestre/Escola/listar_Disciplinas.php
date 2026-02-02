<?php
include_once 'Disciplinas.php';
$disciplina = new Disciplinas();
$disciplinas = $disciplina->listar();
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Lista de Disciplinas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <center><font face="Century Gothic" size="6"><b>Lista de Disciplinas</b></font></center>
    <br>
    <div class="card">
        <div class="card-header bg-info text-white">
            <b>Disciplinas Cadastradas</b>
        </div>
        <div class="card-body">
            <table class="table table-striped table-hover">
                <thead class="table-dark">
                    <tr>
                        <th>Código</th>
                        <th>Nome</th>
                    </tr>
                </thead>
                <tbody>
                    <?php foreach ($disciplinas as $d): ?>
                    <tr>
                        <td><b><?= $d['CodDisciplina'] ?></b></td>
                        <td><?= $d['NomeDisciplina'] ?></td>
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