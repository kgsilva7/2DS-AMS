<?php
class Conectar extends PDO
{
    private static $instancia;
    private $host = "127.0.0.1";
    private $usuario = "root";
    private $senha = "";
    private $db = "bd_escola";

    public function __construct()
    {
        parent::__construct("mysql:host=$this->host;dbname=$this->db", $this->usuario, $this->senha);
    }

    public static function getInstance()
    {
        if (!isset(self::$instancia)) {
            try {
                self::$instancia = new Conectar();
            } catch (Exception $e) {
                echo 'Erro ao conectar: ' . $e->getMessage();
                exit();
            }
        }
        return self::$instancia;
    }
}   
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Document</title>
</head>
<body>
</body>
</html>