package Concretes;

import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{

	private PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}
		
	@Override
	public void add(Player player) {
		
		if(playerCheckService.CheckIfRealPerson(player)) {
			this.add(player);
			System.out.println("Oyuncu eklendi: " + player.getFirstName() + " " +
														player.getLastName());
		}
		else {
			System.out.println("Doðrulama geçersiz");
		}
	}

	@Override
	public void update(Player player) {
		
		if(playerCheckService.CheckIfRealPerson(player)) {
			this.add(player);
			System.out.println("Oyuncu bilgileri güncellendi: " + player.getFirstName() + " " +
																	player.getLastName());
		}
		else {
			System.out.println("Doðrulama geçersiz");
		}
		
	}

	@Override
	public void delete(Player player) {
		
		System.out.println("Oyuncu silindi: " + player.getFirstName() + " " +
												player.getLastName());
	}

}
