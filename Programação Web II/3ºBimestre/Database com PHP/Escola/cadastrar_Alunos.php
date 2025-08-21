<?php
include_once "Conectar.php";
include_once "Alunos.php";
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Cadastrar Aluno</title>
</head>
<body>
    <h2>Cadastro de Alunos</h2>
    <form method="post">
        Matrícula: <input type="text" name="matricula" maxlength="5"><br><br>
        Nome: <input type="text" name="nome" maxlength="50"><br><br>
        Endereço: <input type="text" name="endereco" maxlength="50"><br><br>
        Cidade: <input type="text" name="cidade" maxlength="30"><br><br>
        Código do Curso: <input type="text" name="codcurso" maxlength="2"><br><br>
        <input type="submit" name="btnSalvar" value="Salvar">
    </form>
<?php
if (isset($_POST['btnSalvar'])) {
    $alu = new Alunos();
    $alu->setMatricula($_POST['matricula']);
    $alu->setNome($_POST['nome']);
    $alu->setEndereco($_POST['endereco']);
    $alu->setCidade($_POST['cidade']);
    $alu->setCodcurso($_POST['codcurso']);

    echo "<h3>" . $alu->salvar() . "</h3>";
}
?>
</body>
</html>