<?php
include_once 'Conectar.php';
class Cursos
{
    private $codcurso;
    private $nome;
    private $coddisc1;
    private $coddisc2;
    private $coddisc3;
    public function getCodcurso() { return $this->codcurso; }
    public function setCodcurso($codcurso) { $this->codcurso = $codcurso; } 
    public function getNome() { return $this->nome; }
    public function setNome($nome) { $this->nome = $nome; } 
    public function getCoddisc1() { return $this->coddisc1; }
    public function setCoddisc1($coddisc1) { $this->coddisc1 = $coddisc1; } 
    public function getCoddisc2() { return $this->coddisc2; }
    public function setCoddisc2($coddisc2) { $this->coddisc2 = $coddisc2; } 
    public function getCoddisc3() { return $this->coddisc3; }
    public function setCoddisc3($coddisc3) { $this->coddisc3 = $coddisc3; }
    public function listar()
    {
        try {
            @$this->$conn = new Conectar();
            @$sql = $this->$conn->query("SELECT * FROM cursos order by codcurso");
            $sql->execute();
            return $sql->fetchAll();
            $this->$conn = null;
        } catch (PDOException $e) {
            echo "Erro ao listar cursos: " . $e->getMessage();
            return [];
        }
    }
    public function salvar()
{
    try {
        @$this->$conn = new Conectar();
        @$sql = $this->$conn->prepare("INSERT INTO cursos (codcurso, nome, coddisc1, coddisc2, coddisc3) VALUES (?, ?, ?, ?, ?)");
        @$sql->bindParam(1, $this->codcurso, PDO::PARAM_INT);
        @$sql->bindParam(2, $this->nome, PDO::PARAM_STR);
        @$sql->bindParam(3, $this->coddisc1, PDO::PARAM_INT);
        @$sql->bindParam(4, $this->coddisc2, PDO::PARAM_INT);
        @$sql->bindParam(5, $this->coddisc3, PDO::PARAM_INT);
        if ($sql->execute()) {
            return "Curso salvo com sucesso!";
        }
    } catch (PDOException $e) {
        echo "Erro ao salvar curso: " . $e->getMessage();
        return "Erro ao salvar curso!";
    }
}
public function consultar()
{
    try {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("SELECT * FROM cursos WHERE nome LIKE ?");
        @$sql->bindParam(1, $this->nome, PDO::PARAM_STR);
        $sql->execute();
        return $sql->fetchAll();
    } catch (PDOException $e) {
        echo "Erro ao consultar cursos: " . $e->getMessage();
        return "Erro ao Consultar Cursos!";
    }
}
public function excluir()
{
    try {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("DELETE FROM cursos WHERE codcurso = ?");
        @$sql->bindParam(1, $this->codcurso, PDO::PARAM_STR);       
        if ($sql->execute()) {
            return "Curso excluído com sucesso!";
        } else {
            return "Erro ao excluir curso!";
        }
    } catch (PDOException $e) {
        echo "Erro ao excluir curso: " . $e->getMessage();
        return "Erro ao excluir curso!";
    }
}
public function alterar()
{
    try {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("SELECT * FROM cursos WHERE codcurso = ?");
        @$sql->bindParam(1, $this->codcurso, PDO::PARAM_STR);
        $sql->execute();
        return $sql->fetchAll();
    } catch (PDOException $e) {
        echo "Erro ao alterar curso: " . $e->getMessage();
        return [];
    }
}
public function alterar2()
{
    try {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("UPDATE cursos SET nome = ?, coddisc1 = ?, coddisc2 = ?, coddisc3 = ? WHERE codcurso = ?");
        @$sql->bindParam(1, $this->nome, PDO::PARAM_STR);
        @$sql->bindParam(2, $this->coddisc1, PDO::PARAM_STR);
        @$sql->bindParam(3, $this->coddisc2, PDO::PARAM_STR);
        @$sql->bindParam(4, $this->coddisc3, PDO::PARAM_STR);
        @$sql->bindParam(5, $this->codcurso, PDO::PARAM_STR);
        if ($sql->execute()) {
            return "Curso alterado com sucesso!";
        } else {
            return "Erro ao alterar curso!";
        }
    } catch (PDOException $e) {
        echo "Erro ao alterar curso: " . $e->getMessage();
        return "Erro ao alterar curso!";
    }
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