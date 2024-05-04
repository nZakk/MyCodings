fetch ('pagina1.html', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({
        // está só de enfeite o video q estava vendo está com dados JSON
        name: "User 1"
    })
})
.then (response => {
    if (response.status !== 200) { //status de sucesso em https 
        throw new Error ('Erro no fetch');
    } 
    response.text();
})
.then(data => console.log(data))
.catch(error => console.error(error));

/* fetch('url', { optional})
 Basicamente o fetch request funciona com você passando no primeiro parâmetro
 um url, e no segundo parâmetro OPTION caso você use outro método diferente de GET
 por exemplo POST, caso não seja enviado nada no segundo parâmetro ele se comporta
 como GET, retornando uma promise.
 Retornando uma resposta em um objeto quando capturamos em um THEN podendo ver,
 verificar e comparar os dados dessa resposta, mas os dados da resposta não fica 
 diretamente acessivel no BODY do objeto resposta somente o estatos do fetch
 é retornando, no caso convertendo ela para o tipo de dado que estivermos utilizando
 na aplicação, ai no THEN da conversão retorna outra THEN ai sim com acesso aos dados diretamente.

 O CATCH e tratamaneto de erros em FETCH
  Fetch sempre na maioridas vezes retornará verdadeiro somente quando é um erro 
  no fetch ou ele demorando para se conctar á API, caso a API retorne algum erro 
  digamos o status https 404(ou qualquer outro) de não encontrado o fetch se 
  comportará normalmente executando os Then, 
  o que deve ser feito é nos mesmos verificarmos o Status da resposta que o fetch
  nos retorna para confirmarmos que está tudo OK antes de executar os then adiante,
   caso não usamos para logar o erro noCatch para tratar-lo. 

   Mas com o fetch não estamos somente presos a métodos GET nesse caso tendo que usar o segundo
   parâmetro como OPTION sendo um objeto mandando no metodos algum metodo https ou sendo
   um criado por você mesmo, sendo um POST para enviar dados temos que criar o body
   que é o dado respectivamente que queremos mandar,(como estou vendo um video com banco de dados
    JSON e eu no meu exemplo estava mais pra um simples GET com html bruto), sendo 
    assim para o tipos de datas JSON usamos o JSON.stringify (para JSON n podemos mandar um objeto
    javascript puro temos que mandar em string json) no body dos dados, e assim
    tendo q configurar o headers para enviarmos o tipo de conteúdo para o fetch
    (nesse caso JSON temos que colocar no headers o content-type application/json).
    (recomento para os outros metodos https uma pesquisa para cada um na hora de usar-los
    como por exemplos dados e oque tem q ser enviado dentro do objetos OPTION no fetch).
*/