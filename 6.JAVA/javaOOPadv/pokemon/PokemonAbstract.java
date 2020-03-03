package pokemon;

public abstract class PokemonAbstract implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon p = new Pokemon(name,health,type);
		p.addPokeList();
		return p;
	}
	public String pokemonInfo(Pokemon pokemon) {
		return pokemon.getName()+" "+pokemon.getHealth()+" "+pokemon.getType();
	}
	
}
