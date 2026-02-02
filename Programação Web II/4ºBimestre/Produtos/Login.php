<?php
session_start();
if (isset($_POST['btnentrar'])) {
    include_once 'Usuario.php';
    $u = new Usuario();
    $u->setUsu($_POST['login']);
    $u->setSenha($_POST['senha']);
    $resultado = $u->logar();
    if (!empty($resultado)) {
        $_SESSION['login'] = $_POST['login'];
        header('Location: menu.php');
        exit;
    } else {
        header('Location: loginInvalido.html');
        exit;
    }
}
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Login de Acesso</title>
    <script language=javascript>
        function blokletras(keypress)
        {
            if(keypress>=48 && keypress<=57)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    </SCRIPT>
</head>
<body>
<div class="container mt-5">
    <center><font face="Century Gothic" size="6"><b>Login de acesso</b></font></center>
    <br>   
    <div class="card mx-auto" style="max-width: 400px;">
        <div class="card-header bg-primary text-white">
            <b>Dados:</b>
        </div>
        <div class="card-body">
            <form name="login" method="POST" action="">
                <div class="mb-3">
                    <label class="form-label"><b>Usuário:</b></label>
                    <input name="login" type="text" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Senha:</b></label>
                    <input name="senha" type="password" class="form-control" 
                           maxlength="3" required 
                           onkeypress="return blokletras(window.event.keyCode)">
                </div>
                <center>
                    <input name="btnentrar" type="submit" value="Acessar" class="btn btn-success">
                </center>
            </form>
        </div>
    </div>
</div>
</body>
</html>