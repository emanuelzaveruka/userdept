#USERDEPT
<center>
<img id="#msEmail" src="https://emanuelzaveruka.github.io/portfolio/assets/img/userDept.svg" widht="90%" height="300px">
</center>

> Trata-se de um sistema (API REST) de usuários e departamentos. Nele é possível realizar a consulta do usuário por id, inserir um novo usuário e consultar todos os usuários do banco de dados local.


## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:
* Necessário SDK `Java 17`
* Necessário IDE que suporte projetos java em framework Spring Boot.
* Necessário POSTMAN ou qualquer outra ferramenta para testes de API.

## 🚀 Instalando

Para instalar o **USERDEPT**, siga estas etapas:

Rode no bash ou no seu terminal em um diretório de sua preferência:
```
git clone https://github.com/emanuelzaveruka/userdept.git
```
Ou faça o download e extraia o arquivo no diretório de sua preferência [download do arquivo](https://github.com/emanuelzaveruka/userdept/archive/refs/heads/main.zip)

Abra o projeto em sua IDE e configure para suportar SDK java 17

O USERDEPT utiliza o banco de dados em memória H2 não é necessário configurar.

## ☕ Usando USERDEPT

Para usar o USERDEPT, siga estas etapas:

- Dentro de sua ferramenta de teste de api importe o arquivo **usersdept.postman_collection.json** disponível no diretório /postman.

caso queira configurar manualmente sua requisição no **endpoint**:

Método **GET** user:

Retorna todos os usuários cadastrados no banco de dados.
```
http://localhost:8080/users
```
Método **GET** user by id:

Busca o id passado no parametro e retorna o usuário cadastrado no banco de dados.
/users/idDoUsuário
```
http://localhost:8080/users/1
```
No banco de dados já são cadatrados dois departamentos:

"id": 1 = gestão

"id": 2 = informática

Para inserir mais departamento no banco de dados navegue até src/main/resources/import.sql e no arquivo insira o departamento que deseja, como exemplo:
```
INSERT INTO tb_department(name) VALUES ('Gestão');
INSERT INTO tb_department(name) VALUES ('Informática');
INSERT INTO tb_department(name) VALUES ('Jurídico');
```
Para cadastrar um novo usuário no banco de dados utilize o metódo  **POST**:

corpo da requisição:
```
{
    "name": "Emanuel Zaveruka",
    "email": "emanuelzaveruka@gmail.com",
    "department": {
        "id": 2,
        "name": null
    }
}
```



[⬆ Voltar ao topo](##USERDEPT)<br>
