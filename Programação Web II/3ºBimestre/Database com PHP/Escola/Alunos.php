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
}
?>