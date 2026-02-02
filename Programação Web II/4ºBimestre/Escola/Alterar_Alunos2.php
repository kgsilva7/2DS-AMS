<?php
if (isset($_POST["txtmatricula"])) {
    $txtmatricula = $_POST["txtmatricula"];
    include_once 'Alunos.php';
    $alu = new Alunos();
    $alu->setMatricula($txtmatricula);
    $alu_bd = $alu->alterar();
} else {
    $alu_bd = [];
}
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Alterar Aluno</title>
</head>
<body>
<div class="container mt-5">
    <center><font face="Century Gothic" size="6"><b>Alteração de Alunos Cadastrados</b></font></center>
    <br>   
    <div class="card mx-auto" style="max-width: 600px;">
        <div class="card-header bg-warning text-dark">
            <b>Alterar</b>
        </div>
        <div class="card-body">
            <form method="POST" action="">
                <?php
                if (!empty($alu_bd)) {
                    foreach($alu_bd as $alu_mostrar) {
                ?>
                <input type="hidden" name="txtmatricula" value='<?php echo $alu_mostrar[0] ?>'>
                <div class="mb-3">
                    <label class="form-label"><b>Matrícula: <?php echo $alu_mostrar[0]; ?></b></label>
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Nome:</b></label>
                    <input type="text" name="txtnome" class="form-control" value='<?php echo $alu_mostrar[1] ?>'>
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Endereço:</b></label>
                    <input type="text" name="txtendereco" class="form-control" value='<?php echo $alu_mostrar[2] ?>'>
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Cidade:</b></label>
                    <input type="text" name="txtcidade" class="form-control" value='<?php echo $alu_mostrar[3] ?>'>
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Código do Curso:</b></label>
                    <input type="text" name="txtcodcurso" class="form-control" value='<?php echo $alu_mostrar[4] ?>' maxlength="2">
                </div>
                <center>
                    <input name="btnAlterar" type="submit" value="Alterar" class="btn btn-warning">
                </center>
                <?php
                    }
                } else {
                    echo "<p class='text-center'>Nenhum aluno encontrado com essa matrícula.</p>";
                }
                ?>
            </form>          
            <?php
            extract($_POST, EXTR_OVERWRITE);
            if(isset($btnAlterar)) {
                include_once 'Alunos.php';
                $alu = new Alunos();
                $alu->setNome($txtnome);
                $alu->setEndereco($txtendereco);
                $alu->setCidade($txtcidade);
                $alu->setCodcurso($txtcodcurso);
                $alu->setMatricula($txtmatricula);
                echo "<div class='alert alert-success mt-3'><h3>". $alu->alterar2(). "</h3></div>";
                header("refresh:2; url=menu.php");
            }
            ?>
        </div>
    </div>
    <center class="mt-4">
        <a href="menu.php" class="btn btn-primary">Voltar ao Menu</a>
    </center>
</div>
</body>
</html>