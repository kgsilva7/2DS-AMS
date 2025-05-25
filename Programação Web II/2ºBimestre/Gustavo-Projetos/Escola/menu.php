<?php
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Menu - Escola</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">BD Escola</h2>
        <div class="card mt-4">
            <div class="card-header bg-primary text-white">
                Alunos
            </div>
            <div class="list-group list-group-flush">
                <a href="cadastrar_aluno.php" class="list-group-item list-group-item-action disabled">Cadastrar Aluno</a>
                <a href="pesquisar_aluno.php" class="list-group-item list-group-item-action disabled">Pesquisar Aluno</a>
                <a href="excluir_aluno.php" class="list-group-item list-group-item-action disabled">Excluir Aluno</a>
                <a href="alterar_aluno.php" class="list-group-item list-group-item-action disabled">Alterar Aluno</a>
            </div>
        </div>
        <div class="card mt-4">
            <div class="card-header bg-success text-white">
                Cursos
            </div>
            <div class="list-group list-group-flush">
                <a href="cadastrar_curso.php" class="list-group-item list-group-item-action disabled">Cadastrar Curso</a>
                <a href="pesquisar_curso.php" class="list-group-item list-group-item-action disabled">Pesquisar Curso</a>
                <a href="excluir_curso.php" class="list-group-item list-group-item-action disabled">Excluir Curso</a>
                <a href="alterar_curso.php" class="list-group-item list-group-item-action disabled">Alterar Curso</a>
            </div>
        </div>
        <div class="card mt-4">
            <div class="card-header bg-warning text-dark">
                 Disciplinas
            </div>
            <div class="list-group list-group-flush">
                <a href="cadastrar_disciplina.php" class="list-group-item list-group-item-action disabled">Cadastrar Disciplina</a>
                <a href="pesquisar_disciplina.php" class="list-group-item list-group-item-action disabled">Pesquisar Disciplina</a>
                <a href="excluir_disciplina.php" class="list-group-item list-group-item-action disabled">Excluir Disciplina</a>
                <a href="alterar_disciplina.php" class="list-group-item list-group-item-action disabled">Alterar Disciplina</a>
            </div>
        </div>
    </div>
</body>
</html>