# Projeto web services com Spring Boot e JPA / Hibernate

## Objetivos:
<ul>
    <li>Criar o projeto com Spring Boot Java</li>
    <li>Implementar modelo de domínio</li>
    <li>Estruturar camadas lógicas: resouce, service repository</li>
    <li>Configurar o banco de dados para testes (H2)</li>
    <li>Povoar o banco de dados</li>
    <li>CRUD - Create, Retrieve, Update, Delete</li>
    <li>Tratamento de exceções</li>
    <li>Obs: Neste projeto não tem como foco ocultar dados sensiveis (senhas entre outros)</li>
    <li>Colocar em prática o CRUD,  relação de tabelas e o mundo Spring Boot</li>
</ul>

<br />
<br />

## Como consumir a API:
<strong>Método: GET</strong> - <i>'/users'</i>
```
[
    {
        "name": "Pedro Silva",
        "email": "Silva@gmail.com",
        "phone": "11259554521",
        "password": "159874",
        "idL": 1
    },
    {
        "name": "Amanda",
        "email": "amandinha@gmail.com",
        "phone": "1128885521",
        "password": "1500074",
        "idL": 2
    }
]
```

<strong>Método: GET</strong> - <i>'/users/{id}'</i>
```
{
    "name": "Pedro Silva",
    "email": "Silva@gmail.com",
    "phone": "11259554521",
    "password": "159874",
    "idL": 1
}
```
Caso não existe a pessoa 
```
{
    "timestemp": "2023-12-01T13:39:57Z",
    "status": 404,
    "error": "Resource not found",
    "message": "Resource not found, id: 15",
    "path": "/users/15"
}
```

<strong>Método: POST</strong> - <i>'/users'</i>

<Strong><u>Body:</u></strong>
```
{
    "name": "Bob Matirm",
    "email": "martim@gmail.com",
    "phone": "123165485",
    "password": "456468"
}
```

retorno:
```
{
    "name": "Bob Matirm",
    "email": "martim@gmail.com",
    "phone": "123165485",
    "password": "456468",
    "idL": 5
}
```

<strong>Método: PUT</strong> - <i>'/users/{id}'</i>

<Strong><u>Body:</u></strong>
```
{
    "name": "Pedro",
    "email": "pedro.silva@gmail.com",
    "phone": "115584585"
}
```

retorno:
```
{
    "name": "Pedro",
    "email": "pedro.silva@gmail.com",
    "phone": "115584585",
    "password": "159874",
    "idL": 1
}
```


<strong>Método: DELETE</strong> - <i>'/users/{id}'</i>

Se for deletado tera apenas o retorno Status code: 204 No Content

## API RestFull
Segue o mesmo padrão para Category, Order, Product


<footer>Gostou do meu projeto, e da minha evolução vista em meu GitHub.



 <h2>Dados para contato:</h2>
  <div> 
  <p>
    <a href = "mailto: gustavo.sfernander@gmail.com">gustavo.sfernander@gmail.com</a>
  </p>
  <div>
    <a href="https://www.linkedin.com/in/gustavo-dos-santos-fernandes/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
  </div>
  <div>
    <a href="http://api.whatsapp.com/send?phone=5511958951429" target="_blank"><img src="https://img.shields.io/badge/WhatsApp-25D366?style=for-the-badge&logo=whatsapp&logoColor=white" target="_blank"></a>
  </div>
</div>

</footer>
