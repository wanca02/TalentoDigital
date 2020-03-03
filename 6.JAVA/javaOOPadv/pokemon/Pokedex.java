package pokemon;

import java.util.ArrayList;

public class Pokedex extends PokemonAbstract{
	
	private static int myPokemons=Pokemon.getCount();
	
	public void listPokemon() {
		ArrayList<Pokemon> n=Pokemon.getListPoke();
		System.out.println("Lista de todos los Pokémon...");
		for(Pokemon x: n) {
			System.out.println(pokemonInfo(x));
		}
	}
}
