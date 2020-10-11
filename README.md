# Lab6

Laboratório 6 da disciplina de Psoft. 
<h1>Refatoração:  </h1>
  <h4>Bad Smells encontrados: </h4>
    <p> - Na classe gerente estava sendo usado muitos metodos da classe Projeto, um Feature Envy</p>
    <p> - No metodo de checar havia muitas responsabilidades, ou seja, um Long Method, ele foi portanto, desestruturado. </p>
    <h3> Definicoes: </h3>
      <p>* Feature Envy: A method accesses the data of another object more than its own data. </p>
      <p>* Long Method: A method contains too many lines of code. Generally, any method longer than ten lines should make you start asking questions.</p>
