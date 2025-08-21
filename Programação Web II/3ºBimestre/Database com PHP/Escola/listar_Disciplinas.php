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
        <h2 class="text-center mb-4">Lista de Disciplinas</h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Código</th>
                    <th>Nome</th>
                </tr>
            </thead>
            <tbody>
                <?php foreach ($disciplinas as $d): ?>
                <tr>
                    <td><?= $d['CodDisciplina'] ?></td>
                    <td><?= $d['NomeDisciplina'] ?></td>
                </tr>
                <?php endforeach; ?>
            </tbody>
        </table>
        <a href="menu.php" class="btn btn-primary mt-3">Voltar ao Menu</a>
    </div>
</body>
</html>