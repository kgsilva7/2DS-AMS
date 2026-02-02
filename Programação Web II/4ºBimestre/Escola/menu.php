<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Menu - Escola</title>
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
        <h2 class="text-center">ESCOLA</h2>
        
        <div class="card mt-4">
            <div class="card-header bg-primary text-white">
                <b>Alunos:</b>
            </div>
            <div class="list-group list-group-flush">
                <a href="Listar_Alunos.php" class="list-group-item list-group-item-action">Listar Alunos</a>
                <a href="Cadastrar_Alunos.php" class="list-group-item list-group-item-action">Cadastrar Alunos</a>
                <a href="Consultar_Alunos.php" class="list-group-item list-group-item-action">Consultar Alunos</a>
                <a href="Excluir_Alunos.php" class="list-group-item list-group-item-action">Excluir Alunos</a>
                <a href="Alterar_Alunos.php" class="list-group-item list-group-item-action">Alterar Alunos</a>
            </div>
        </div>       
        <div class="card mt-4">
            <div class="card-header bg-success text-white">
                <b>Cursos:</b>
            </div>
            <div class="list-group list-group-flush">
                <a href="Listar_cursos.php" class="list-group-item list-group-item-action">Listar Cursos</a>
                <a href="Cadastrar_Cursos.php" class="list-group-item list-group-item-action">Cadastrar Cursos</a>
                <a href="Consultar_Cursos.php" class="list-group-item list-group-item-action">Consultar Cursos</a>
                <a href="Excluir_Cursos.php" class="list-group-item list-group-item-action">Excluir Cursos</a>
                <a href="Alterar_Cursos.php" class="list-group-item list-group-item-action">Alterar Cursos</a>
            </div>
        </div>  
        <div class="card mt-4">
            <div class="card-header bg-warning text-dark">
                <b>Disciplinas:</b>
            </div>
            <div class="list-group list-group-flush">
                <a href="Listar_Disciplinas.php" class="list-group-item list-group-item-action">Listar Disciplinas</a>
                <a href="Cadastrar_Disciplinas.php" class="list-group-item list-group-item-action">Cadastrar Disciplinas</a>
                <a href="Consultar_Disciplinas.php" class="list-group-item list-group-item-action">Consultar Disciplinas</a>
                <a href="Excluir_Disciplinas.php" class="list-group-item list-group-item-action">Excluir Disciplinas</a>
                <a href="Alterar_Disciplinas.php" class="list-group-item list-group-item-action">Alterar Disciplinas</a>
            </div>
        </div>
    </div> 
    <footer class="mt-5">
        <div class="container">
            <center><h5>Desenvolvido por Gustavo Alexandre da Silva</h5></center>
        </div>
    </footer>
</body>
</html>