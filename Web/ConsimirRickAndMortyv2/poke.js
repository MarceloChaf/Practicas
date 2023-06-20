function getRandomInt(max) {
    return Math.floor(Math.random() * max);
  }

let  lugares = [5];
let random;

// Función para realizar la solicitud a la PokeAPI y mostrar los datos en formato de tarjeta con imagen
function obtenerDatosPokeAPI() {
    // Realiza la solicitud GET a la URL de la PokeAPI
    fetch('https://pokeapi.co/api/v2/pokemon?limit=9')
      .then(response => response.json())
      .then(data => {

        
        // Obtén una referencia al elemento de la sección de "Otra API" donde mostrarás los datos
        const otraApiSection = document.getElementById('contact-tab-pane');
  
        // Limpia el contenido actual en caso de que haya datos anteriores
        otraApiSection.innerHTML = '';
        
        // Crea un contenedor para las tarjetas de los Pokémon
        const cardContainer = document.createElement('div');
        cardContainer.classList.add('card-container');
  
        // Itera sobre los resultados de la solicitud y crea una tarjeta para cada Pokémon
        data.results.forEach((pokemon, index) => {
          // Crea la tarjeta
          const card = document.createElement('div');
          card.classList.add('card');
  
          // Crea el contenido de la tarjeta
          const cardContent = document.createElement('div');
          cardContent.classList.add('card-content');
  
          // Crea el título de la tarjeta con el nombre y el ID de Pokédex
          const cardTitle = document.createElement('h3');
          cardTitle.textContent = `#${index + 1} - ${pokemon.name}`;
  
          // Crea la imagen del Pokémon
          const image = document.createElement('img');
          image.src = `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${index + 1}.png`;
          image.alt = pokemon.name;
  
          // Crea el párrafo con la generación del Pokémon
          const generationPara = document.createElement('p');
          generationPara.textContent = `Generación: ${Math.ceil((index + 1) / 151)}`;
  
          // Agrega el título, la imagen y el párrafo al contenido de la tarjeta
          cardContent.appendChild(cardTitle);
          cardContent.appendChild(image);
          cardContent.appendChild(generationPara);
  
          // Agrega el contenido a la tarjeta
          card.appendChild(cardContent);
  
          // Agrega la tarjeta al contenedor
          cardContainer.appendChild(card);
        });
  
        // Agrega el contenedor de las tarjetas al elemento de la sección "Otra API"
        otraApiSection.appendChild(cardContainer);
      })
      .catch(error => {
        console.log('Ha ocurrido un error:', error);
      });
  }
  
  // Llama a la función para obtener los datos de la PokeAPI cuando se haga clic en la pestaña correspondiente
  document.getElementById('contact-tab').addEventListener('click', obtenerDatosPokeAPI);