<?php
include_once 'Conectar.php';
class Alunos
{
    private $matricula;
    private $nome;
    private $endereco;
    private $cidade;
    private $codcurso;
    public function getMatricula() { 
        return $this->matricula; 
    }
    public function setMatricula($matricula) {
        $this->matricula = $matricula; 
    }
    public function getNome() { 
        return $this->nome; 
    }
    public function setNome($nome) { 
        $this->nome = $nome; 
    }
    public function getEndereco() { 
        return $this->endereco; 
    }
    public function setEndereco($endereco) { 
        $this->endereco = $endereco; 
    }
    public function getCidade() { 
        return $this->cidade; 
    }
    public function setCidade($cidade) { 
        $this->cidade = $cidade; 
    }
    public function getCodcurso() { 
        return $this->codcurso; 
    }
    public function setCodcurso($codcurso) { 
        $this->codcurso = $codcurso; 
    }
    public function listar()
    {
        try {
            @$this->$conn = new Conectar();
            @$sql = $this->$conn->query("SELECT * FROM alunos order by matricula");
            $sql->execute();
            return $sql->fetchAll();
            $this->$conn = null;
        } catch (PDOException $e) {
            echo "Erro ao listar alunos: " . $e->getMessage();
            return [];
        }
    }
    public function salvar()
    {
        try {
            @$this->$conn = new Conectar();
            @$sql = $this->$conn->prepare("INSERT INTO alunos (matricula, nome, endereco, cidade, codcurso) VALUES (?, ?, ?, ?, ?)");
            @$sql->bindParam(1, $this->matricula, PDO::PARAM_STR);
            @$sql->bindParam(2, $this->nome, PDO::PARAM_STR);
            @$sql->bindParam(3, $this->endereco, PDO::PARAM_STR);
            @$sql->bindParam(4, $this->cidade, PDO::PARAM_STR);
            @$sql->bindParam(5, $this->codcurso, PDO::PARAM_STR);
            if ($sql->execute()) {
                return "Aluno salvo com sucesso!";
            }
        } catch (PDOException $e) {
            echo "Erro ao salvar aluno: " . $e->getMessage();
            return "Erro ao salvar aluno!";
        }
    }
    public function consultar()
{
    try {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("SELECT * FROM alunos WHERE nome LIKE ?");
        @$sql->bindParam(1, $this->nome, PDO::PARAM_STR);
        $sql->execute();
        return $sql->fetchAll();
    } catch (PDOException $e) {
        echo "Erro ao consultar alunos: " . $e->getMessage();
        return "Erro ao consultar o Aluno!";
    }
}
public function excluir()
{
    try {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("DELETE FROM alunos WHERE matricula = ?");
        @$sql->bindParam(1, $this->matricula, PDO::PARAM_STR);        
        if ($sql->execute()) {
            return "Aluno excluído com sucesso!";
        } else {
            return "Erro ao excluir aluno!";
        }
    } catch (PDOException $e) {
        echo "Erro ao excluir aluno: " . $e->getMessage();
        return "Erro ao excluir aluno!";
    }
}
public function alterar()
{
    try {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("SELECT * FROM alunos WHERE matricula = ?");
        @$sql->bindParam(1, $this->matricula, PDO::PARAM_STR);
        $sql->execute();
        return $sql->fetchAll();
    } catch (PDOException $e) {
        echo "Erro ao alterar aluno: " . $e->getMessage();
        return [];
    }
}
public function alterar2()
{
    try {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("UPDATE alunos SET nome = ?, endereco = ?, cidade = ?, codcurso = ? WHERE matricula = ?");
        @$sql->bindParam(1, $this->nome, PDO::PARAM_STR);
        @$sql->bindParam(2, $this->endereco, PDO::PARAM_STR);
        @$sql->bindParam(3, $this->cidade, PDO::PARAM_STR);
        @$sql->bindParam(4, $this->codcurso, PDO::PARAM_STR);
        @$sql->bindParam(5, $this->matricula, PDO::PARAM_STR);
        if ($sql->execute()) {
            return "Aluno alterado com sucesso!";
        } else {
            return "Erro ao alterar aluno!";
        }
    } catch (PDOException $e) {
        echo "Erro ao alterar aluno: " . $e->getMessage();
        return "Erro ao alterar aluno!";
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