# Note App

Este projeto é um aplicativo de notas desenvolvido em Java, utilizando o padrão de projeto MVC (Model-View-Controller) para organizar a estrutura do código e facilitar a manutenção. O projeto também faz uso de outros padrões de design para promover flexibilidade e extensibilidade.

## Estrutura do Projeto

- **Model**: Representa os dados e a lógica de negócio (ex: `Note`, `Theme`, `NoteFactory`, etc).
- **View**: Responsável pela interface gráfica do usuário (ex: `MainWindow`, `NoteEditorPanel`, `StatusBar`, etc).
- **Controller**: Gerencia a comunicação entre Model e View (ex: `NoteController`, `ThemeController`).

## Design Patterns Utilizados

- **MVC (Model-View-Controller)**: Organiza o projeto em três camadas principais, separando lógica de negócio, interface e controle.
- **Factory Method**: Utilizado para criar instâncias de notas e temas de forma flexível (`NoteFactory`, `ThemeFactory`, `FinanceNoteFactory`, `FootballNoteFactory`).
- **Observer**: Implementado para monitorar alterações no editor de notas e atualizar componentes da interface conforme necessário (`EditorObserver`, `EditorPublisher`, `CharactersCountObserver`, `WordCountObserver`, etc).

## Como executar

1. Certifique-se de ter o Java instalado (JDK 8 ou superior).
2. Compile o projeto usando o comando:
   ```bash
   mvn clean install
   ```
3. Execute a aplicação:
   ```bash
   mvn exec:java -Dexec.mainClass="com.davidesdras.Main"
   ```

## Autor

David Esdras

---
Este projeto é apenas para fins educacionais e demonstração de padrões de projeto em Java.
