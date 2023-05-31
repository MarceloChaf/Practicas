function getRandomInt(max) {
    return Math.floor(Math.random() * max);
  }

let  lugares = [5];
let random;
// Realiza una solicitud a la API de Rick and Morty
fetch('https://rickandmortyapi.com/api/character/')
.then(response => response.json())
.then(data => {
  const characters = data.results;


  // Muestra 9 personajes aleatorios
  const characterList = document.getElementById('character-list');

  for (let i = 0; i < 9; i++) {
    while (true) {
        random=getRandomInt(20);
        if (lugares.indexOf(random) === -1) {
            lugares.push(random);
            break
        }
    }
    
    const character = characters[random];
    
    const characterCard = document.createElement('div');
    characterCard.classList.add('col-md-4');

    const card = document.createElement('div');
    card.classList.add('card', 'mb-4');

    const image = document.createElement('img');
    image.src = character.image;
    image.classList.add('card-img-top');

    const cardBody = document.createElement('div');
    cardBody.classList.add('card-body');

    const name = document.createElement('h5');
    name.classList.add('card-title');
    name.textContent = character.name;

    const status = document.createElement('p');
    status.classList.add('card-text');
    status.textContent = `Estado: ${character.status}`;

    const species = document.createElement('p');
    species.classList.add('card-text');
    species.textContent = `Especie: ${character.species}`;

    const gender = document.createElement('p');
    gender.classList.add('card-text');
    gender.textContent = `Género: ${character.gender}`;

    const origin = document.createElement('p');
    origin.classList.add('card-text');
    origin.textContent = `Origen: ${character.origin.name}`;

    const location = document.createElement('p');
    location.classList.add('card-text');
    location.textContent = `Ubicación: ${character.location.name}`;

    cardBody.appendChild(name);
    cardBody.appendChild(status);
    cardBody.appendChild(species);
    cardBody.appendChild(gender);
    cardBody.appendChild(origin);
    cardBody.appendChild(location);

    card.appendChild(image);
    card.appendChild(cardBody);

    characterCard.appendChild(card);
    characterList.appendChild(characterCard);
  }
});

// Realiza una solicitud a la API de Rick and Morty
fetch('https://rickandmortyapi.com/api/episode/')
.then(response => response.json())
.then(data => {
   const episodes = data.results;

   // Crea las filas de la tabla con los episodios
   const tableBody = document.querySelector('#episode-table tbody');

   episodes.forEach(episode => {
   const row = document.createElement('tr');

   const episodeNumber = document.createElement('td');
   episodeNumber.textContent = episode.episode;

   const episodeName = document.createElement('td');
   episodeName.textContent = episode.name;

   const releaseDate = document.createElement('td');
   releaseDate.textContent = episode.air_date;

   row.appendChild(episodeNumber);
   row.appendChild(episodeName);
   row.appendChild(releaseDate);

   tableBody.appendChild(row);
   });
});