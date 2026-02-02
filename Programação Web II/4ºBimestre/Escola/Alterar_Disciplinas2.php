<?php
if (isset($_POST["txtcoddisc"])) {
    $txtcoddisc = $_POST["txtcoddisc"];
    include_once 'Disciplinas.php';
    $disc = new Disciplinas();
    $disc->setCodDisciplina($txtcoddisc);
    $disc_bd = $disc->alterar();
} else {
    $disc_bd = [];
}
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Alterar Disciplina</title>
</head>
<body>
<div class="container mt-5">
    <center><font face="Century Gothic" size="6"><b>Alteração de Disciplinas Cadastradas</b></font></center>
    <br>
    <div class="card mx-auto" style="max-width: 600px;">
        <div class="card-header bg-warning text-dark">
            <b>Alterar</b>
        </div>
        <div class="card-body">
            <form method="POST" action="">
                <?php
                if (!empty($disc_bd)) {
                    foreach($disc_bd as $disc_mostrar) {
                ?>
                <input type="hidden" name="txtcoddisc" value='<?php echo $disc_mostrar[0] ?>'>
                <div class="mb-3">
                    <label class="form-label"><b>Código: <?php echo $disc_mostrar[0]; ?></b></label>
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Nome:</b></label>
                    <input type="text" name="txtnomedisc" class="form-control" value='<?php echo $disc_mostrar[1] ?>'>
                </div>
                <center>
                    <input name="btnAlterar" type="submit" value="Alterar" class="btn btn-warning">
                </center>
                <?php
                    }
                } else {
                    echo "<p class='text-center'>Nenhuma disciplina encontrada com esse código.</p>";
                }
                ?>
            </form>          
            <?php
            extract($_POST, EXTR_OVERWRITE);
            if(isset($btnAlterar)) {
                include_once 'Disciplinas.php';
                $disc = new Disciplinas();
                $disc->setNomeDisciplina($txtnomedisc);
                $disc->setCodDisciplina($txtcoddisc);
                echo "<div class='alert alert-success mt-3'><h3>". $disc->alterar2(). "</h3></div>";
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