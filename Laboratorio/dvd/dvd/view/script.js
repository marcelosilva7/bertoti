async function buscarDvds() {
    try {
        const response = await axios.get('http://localhost:8080/dvd');
        const dvds = response.data;
    
        const selectDvds = document.getElementById('tabela');
    
        dvds.forEach(dvd => {
          const linha = document.createElement('tr');
          const idDvd = document.createElement ('td')
          idDvd.textContent = dvd.id
          const dvdTitulo = document.createElement ('td')
          dvdTitulo.textContent = dvd.titulo
          const dvdAno = document.createElement ('td')
          dvdAno.textContent = dvd.ano
          const dvdDiretor = document.createElement ('td')
          dvdDiretor.textContent = dvd.diretor
          const dvdGenero = document.createElement ('td')
          dvdGenero.textContent = dvd.genero
          linha.appendChild(idDvd)
          linha.appendChild(dvdTitulo)
          linha.appendChild(dvdAno)
          linha.appendChild(dvdDiretor)
          linha.appendChild(dvdGenero)
          selectDvds.appendChild(linha)
        });
      } catch (error) {
        console.error(error)
      }
    }

async function cadastrar(){
    const titulo = document.getElementById("txttitulo")
    const ano = document.getElementById("txtano")
    const diretor = document.getElementById("txtdiretor")
    const genero = document.getElementById("txtgenero")

     await axios.post('http://localhost:8080/dvd',{
        titulo: titulo.value,
        ano: ano.value,
        diretor: diretor.value,
        genero: genero.value
    })
}

document.addEventListener('DOMContentLoaded', () => {
    buscarDvds();
  });
