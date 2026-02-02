<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
include_once 'Conectar.php';
class Usuario
{
    private $usu;
    private $senha;
    private $conn;
    public function getUsu()
    {
        return $this->usu;
    }
    public function setUsu($usuario)
    {
        $this->usu = $usuario;
    }
    public function getSenha()
    {
        return $this->senha;
    }
    public function setSenha($senha)
    {
        $this->senha = $senha;
    }

    public function logar()
    {
        try
        {
            $this->conn = new Conectar();
            $sql = $this->conn->prepare("SELECT * FROM usuario WHERE Login LIKE ? and Senha = ?");
            @$sql->bindParam(1, $this->getUsu(), PDO::PARAM_STR);
            @$sql->bindParam(2, $this->getSenha(), PDO::PARAM_STR);
            $sql->execute();
            return $sql->fetchAll();
            $this->conn = null;
        }
        catch(PDOException $exec)
        {
            echo "<span class='text-green-200'>Erro ao executar consulta.</span>". $exec->getMessage();
        }
    }
}
?>
</body>
</html>