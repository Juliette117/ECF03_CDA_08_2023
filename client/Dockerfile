# # build avec Node
# FROM node:22-bookworm-slim AS build

# # Définir le répertoire de travail dans le conteneur
# WORKDIR /app

# # Copier les fichiers nécessaires
# COPY package*.json ./

# RUN npm install

# # Copier tout le code source
# COPY . .
# # RUN npm run build

# # Commandes de run
# CMD ["npm", "start"]


# Étape 1 : Build React
FROM node:20 AS build
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
ENV NODE_OPTIONS=--openssl-legacy-provider
RUN npm run build

# Étape 2 : Serveur Express
FROM node:20-alpine
WORKDIR /app

# Copie le build React
COPY --from=build /app/build ./build

# Copie server.js et installe Express
COPY server.js .
RUN npm install express

EXPOSE 80
CMD ["node", "server.js"]