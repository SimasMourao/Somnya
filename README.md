# Somnya

**Somnya** é um launcher Android desenvolvido em Kotlin, criado para transformar a interface do aparelho em uma experiência dedicada à música, deixando de lado recursos que não são essenciais para esse propósito.

O projeto começou como uma aplicação de console para desenvolver e testar a lógica do sistema antes da implementação da interface Android.

## Objetivo

Desenvolver uma interface simples e funcional para:

- Reprodução de músicas locais
- Organização de músicas em playlists
- Reprodução e gerenciamento de músicas
- Acesso ao Spotify
- Acesso ao YouTube Music
- Interface otimizada para música

## Roadmap

O desenvolvimento do Somnya será dividido em versões, evoluindo gradualmente de uma aplicação de console para um launcher Android.

### v0.1 — Console

Primeira implementação do projeto utilizando Kotlin em console.

Objetivo: desenvolver a estrutura básica do launcher sem depender de uma interface gráfica.

Funcionalidades iniciais:

- Menu principal
- Criação de playlists
- Listagem de playlists
- Exclusão de playlists

---

### v0.2 — Biblioteca de músicas e playlists

Expansão da estrutura desenvolvida na v0.1.

Objetivos:

- Cadastro de músicas
- Biblioteca de músicas
- Adição e remoção de músicas
- Organização por playlists
- Navegação entre playlists

---

### v0.2+local — Arquivos locais

Extensão da v0.2, focada em substituir o cadastro manual de músicas pela leitura de arquivos de música locais.

Objetivos:

- Encontrar músicas armazenadas no dispositivo
- adicionar à biblioteca a partir dos próprios arquivos

---

### v0.3 — Máquina de estados

Implementação da máquina de estados e lógica e simulação da tela **Tocando Agora**.

Objetivos:

- Música atual
- Artista
- Álbum
- Duração
- Play/Pause
- Próxima música
- Música anterior
- Controle da fila de reprodução

Esta versão continuará sendo executada em console, mas terá como objetivo reproduzir o comportamento da futura interface gráfica.

---

### v0.4 — Persistência

Implementação do armazenamento permanente dos dados.

Objetivos:

- Salvar músicas
- Salvar playlists
- Carregar dados ao iniciar o programa
- Manter informações entre execuções

---

### v1.0 — Android

Migração do projeto para Android utilizando **Kotlin** e **Jetpack Compose**.

Objetivos:

- Interface gráfica
- Biblioteca de músicas
- Playlists
- Tela Tocando Agora
- Navegação entre telas
- Barra superior com informações do sistema
- Barra inferior de navegação
- Integração com Spotify
- Integração com YouTube Music
- Definição do Somnya como launcher padrão

## Tecnologias

- **Kotlin**
- **Intellij**
- **Android**
- **Jetpack Compose** — a partir da v1.0

## Status

**Em desenvolvimento**

Atualmente o projeto está na fase de desenvolvimento da lógica em Kotlin através do console.

## Estrutura de desenvolvimento

```text
Somnya
│
├── v0.1
│   └── Console
│
├── v0.2
│   └── Biblioteca e Playlists
│
├── v0.3
│   └── Tocando Agora
│
├── v0.4
│   └── Persistência
│
└── v1.0
    └── Android + Jetpack Compose
```
## Imagens

<div align = "center">
<img width="250" height="250" alt="somnyaSemFundo" src="https://github.com/user-attachments/assets/d2fbc2fe-449e-4304-a777-0b6124fc1ba2" />

<img width="264" height="273" alt="layout_interface" src="https://github.com/user-attachments/assets/90322d72-b489-4813-b29a-90231a9b6187" />

<img width="306" height="322" alt="ChatGPT Image 12 de ago  de 2026, 16_30_50" src="https://github.com/user-attachments/assets/0e1b5787-48ad-40fd-bbb3-352a7fabd5d2" />
</div>
