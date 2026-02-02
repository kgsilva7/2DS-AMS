<?php
if (isset($_POST["txtcodcurso"])) {
    $txtcodcurso = $_POST["txtcodcurso"];
    include_once 'Cursos.php';
    $cur = new Cursos();
    $cur->setCodcurso($txtcodcurso);
    $cur_bd = $cur->alterar();
} else {
    $cur_bd = [];
}
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Alterar Curso</title>
</head>
<body>
<div class="container mt-5">
    <center><font face="Century Gothic" size="6"><b>Alteração de Cursos Cadastrados</b></font></center>
    <br>  
    <div class="card mx-auto" style="max-width: 600px;">
        <div class="card-header bg-warning text-dark">
            <b>Alterar</b>
        </div>
        <div class="card-body">
            <form method="POST" action="">
                <?php
                if (!empty($cur_bd)) {
                    foreach($cur_bd as $cur_mostrar) {
                ?>
                <input type="hidden" name="txtcodcurso" value='<?php echo $cur_mostrar[0] ?>'>
                <div class="mb-3">
                    <label class="form-label"><b>Código: <?php echo $cur_mostrar[0]; ?></b></label>
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Nome:</b></label>
                    <input type="text" name="txtnome" class="form-control" value='<?php echo $cur_mostrar[1] ?>'>
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Cód. Disciplina 1:</b></label>
                    <input type="text" name="txtcoddisc1" class="form-control" value='<?php echo $cur_mostrar[2] ?>' maxlength="2">
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Cód. Disciplina 2:</b></label>
                    <input type="text" name="txtcoddisc2" class="form-control" value='<?php echo $cur_mostrar[3] ?>' maxlength="2">
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Cód. Disciplina 3:</b></label>
                    <input type="text" name="txtcoddisc3" class="form-control" value='<?php echo $cur_mostrar[4] ?>' maxlength="2">
                </div>
                <center>
                    <input name="btnAlterar" type="submit" value="Alterar" class="btn btn-warning">
                </center>
                <?php
                    }
                } else {
                    echo "<p class='text-center'>Nenhum curso encontrado com esse código.</p>";
                }
                ?>
            </form>          
            <?php
            extract($_POST, EXTR_OVERWRITE);
            if(isset($btnAlterar)) {
                include_once 'Cursos.php';
                $cur = new Cursos();
                $cur->setNome($txtnome);
                $cur->setCoddisc1($txtcoddisc1);
                $cur->setCoddisc2($txtcoddisc2);
                $cur->setCoddisc3($txtcoddisc3);
                $cur->setCodcurso($txtcodcurso);
                echo "<div class='alert alert-success mt-3'><h3>". $cur->alterar2(). "</h3></div>";
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