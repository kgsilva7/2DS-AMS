<?php
include_once 'Conectar.php';
class Disciplinas
{
    private $CodDisciplina;
    private $NomeDisciplina;
    public function getCodDisciplina() { return $this->CodDisciplina; }
    public function setCodDisciplina($CodDisciplina) { $this->CodDisciplina = $CodDisciplina; }    
    public function getNomeDisciplina() { return $this->NomeDisciplina; }
    public function setNomeDisciplina($NomeDisciplina) { $this->NomeDisciplina = $NomeDisciplina; }
      public function listar()
    {
        try {
            @$this->$conn = new Conectar();
            @$sql = $this->$conn->query("SELECT * FROM disciplinas order by CodDisciplina");
            $sql->execute();
            return $sql->fetchAll();
            $this->$conn = null;
        } catch (PDOException $e) {
            echo "Erro ao listar disciplinas: " . $e->getMessage();
            return [];
        }
    }
    public function salvar()
    {
        try {
            @$this->$conn = new Conectar();
            @$sql = $this->$conn->prepare("INSERT INTO disciplinas (CodDisciplina, NomeDisciplina) VALUES (?, ?)");
            @$sql->bindParam(1, $this->CodDisciplina, PDO::PARAM_STR);
            @$sql->bindParam(2, $this->NomeDisciplina, PDO::PARAM_STR);
            if ($sql->execute()) {
                return "Disciplina salva com sucesso!";
            }
        } catch (PDOException $e) {
            echo "Erro ao salvar disciplina: " . $e->getMessage();
            return "Erro ao salvar disciplina!";
        }
    }
public function consultar()
{
    try {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("SELECT * FROM disciplinas WHERE NomeDisciplina LIKE ?");
        @$sql->bindParam(1, $this->NomeDisciplina, PDO::PARAM_STR);
        $sql->execute();
        return $sql->fetchAll();
    } catch (PDOException $e) {
        echo "Erro ao consultar disciplinas: " . $e->getMessage();
        return "Erro ao Consultar a Disciplina!";
    }
}
public function excluir()
{
    try {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("DELETE FROM disciplinas WHERE CodDisciplina = ?");
        @$sql->bindParam(1, $this->CodDisciplina, PDO::PARAM_STR);        
        if ($sql->execute()) {
            return "Disciplina excluída com sucesso!";
        } else {
            return "Erro ao excluir disciplina!";
        }
    } catch (PDOException $e) {
        echo "Erro ao excluir disciplina: " . $e->getMessage();
        return "Erro ao excluir disciplina!";
    }
}
public function alterar()
{
    try {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("SELECT * FROM disciplinas WHERE CodDisciplina = ?");
        @$sql->bindParam(1, $this->CodDisciplina, PDO::PARAM_STR);
        $sql->execute();
        return $sql->fetchAll();
    } catch (PDOException $e) {
        echo "Erro ao alterar disciplina: " . $e->getMessage();
        return [];
    }
}
public function alterar2()
{
    try {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("UPDATE disciplinas SET NomeDisciplina = ? WHERE CodDisciplina = ?");
        @$sql->bindParam(1, $this->NomeDisciplina, PDO::PARAM_STR);
        @$sql->bindParam(2, $this->CodDisciplina, PDO::PARAM_STR);
        if ($sql->execute()) {
            return "Disciplina alterada com sucesso!";
        } else {
            return "Erro ao alterar disciplina!";
        }
    } catch (PDOException $e) {
        echo "Erro ao alterar disciplina: " . $e->getMessage();
        return "Erro ao alterar disciplina!";
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