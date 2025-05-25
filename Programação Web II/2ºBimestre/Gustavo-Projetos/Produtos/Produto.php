<?php
include_once 'Conectar.php';

class Produto
{
    private $id;
    private $nome;
    private $estoque;
    private $conn;

    public function getId() {
        return $this->id;
    }

    public function setId($id) {
        $this->id = $id;
    }

    public function getNome() {
        return $this->nome;
    }

    public function setNome($nome) {
        $this->nome = $nome;
    }

    public function getEstoque() {
        return $this->estoque;
    }

    public function setEstoque($estoque) {
        $this->estoque = $estoque;
    }

    
    function salvar() {
        try {
            $this->conn = Conectar::getInstance();
            $sql = $this->conn->prepare("INSERT INTO produtos VALUES (null, ?, ?)");
            $sql->bindParam(1, $this->getNome(), PDO::PARAM_STR);
            $sql->bindParam(2, $this->getEstoque(), PDO::PARAM_STR);
            if ($sql->execute() == 1) {
                return "Registro salvo com sucesso!";
            }
            $this->conn = null;
        } catch (PDOException $exc) {
            echo "Erro ao salvar o regitro. " . $exc->getMessage();
        }
    }

    function alterar() {
        try {
            $this->conn = Conectar::getInstance();
            $sql = $this->conn->prepare("SELECT * FROM produtos WHERE id = ?");
            $sql->bindParam(1, $this->getId(), PDO::PARAM_STR);
            $sql->execute();
            return $sql->fetchAll();
            $this->conn = null;
        } catch (PDOException $exc) {
            echo "Erro ao alterar. " . $exc->getMessage();
        }
    }

    function alterar2() {
        try {
            $this->conn = Conectar::getInstance();
            $sql = $this->conn->prepare("UPDATE produtos SET nome = ?, estoque = ? WHERE id = ?");
            $sql->bindParam(1, $this->getNome(), PDO::PARAM_STR);
            $sql->bindParam(2, $this->getEstoque(), PDO::PARAM_STR);
            $sql->bindParam(3, $this->getId(), PDO::PARAM_STR);
            if ($sql->execute() == 1) {
                return "Registro alterado com sucesso!";
            }
             $this->conn = null;
        } catch (PDOException $exc) {
            echo "Erro ao salvar o registro " . $exc->getMessage();
        }
    }

    function consultar() {
        try {
            $this->conn = Conectar::getInstance();
            $sql = $this->conn->prepare("SELECT * FROM produtos WHERE nome LIKE ?");
            $sql->bindParam(1, $this->getNome(), PDO::PARAM_STR);
            $sql->execute();
            return $sql->fetchAll();
             $this->conn = null;
        } catch (PDOException $exc) {
            echo "Erro ao executar a consulta. " . $exc->getMessage();
        }
    }

    function excluir() {
        try {
            $this->conn = Conectar::getInstance();
            $sql = $this->conn->prepare("DELETE FROM produtos WHERE id = ?");
            $sql->bindParam(1, $this->getId(), PDO::PARAM_STR);
            if ($sql->execute() == 1) {
                return "Exclusão realizada!";
            } else {
                return "Erro na exclusão!";
            }
             $this->conn = null;
        } catch (PDOException $exc) {
            echo "Erro ao excluir: " . $exc->getMessage();
        }
    }

    function listar() {
        try {
            $this->conn = Conectar::getInstance();
            $sql = $this->conn->query("SELECT * FROM produtos ORDER BY nome");
            return $sql->fetchAll();
        } catch (PDOException $exc) {
            return [];
        }
    }
}
?>