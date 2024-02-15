/**
 * 
 */
package com.sddevops.jenkins_maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class SongCollectionTest {
	
	private SongCollection sc;
	private Song s1;
	private Song s2;
	private Song s3;
	private Song s4;
	private final int SONG_COLLECTION_SIZE=4;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		sc=new SongCollection();
		s1 = new Song("001","good 4 u","Olivia Rodrigo",3.59);
		s2 = new Song("002","Peaches","Justin Bieber",3.18);
		s3 = new Song("003","MONTERO","Lil Nas",2.3);
		s4 = new Song("004","bad guy","billie eilish",3.14);
		sc.addSong(s1);
		sc.addSong(s2);
		sc.addSong(s3);
		sc.addSong(s4);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		//after executon of  test, i want to reset or cler th variable
		sc=null;
		
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven.eclipse.SongCollection#getSongs()}.
	 */
	@Test
	void testGetSongs() {
		sc=new SongCollection();
		s1 = new Song("001","good 4 u","Olivia Rodrigo",3.59);
	
		sc.addSong(s1);
		//assertEquals(1,sc.getSongs().size());
		fail("not implemented yt");
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven.eclipse.SongCollection#addSong(com.sddevops.junit_maven.eclipse.Song)}.
	 */
	@Test
	void testAddSong() {
		Song s5 = new Song("005","bad guy","billie eilish",3.14);
		//fail("Not yet implemented");
		List<Song> testSc=sc.getSongs();
		//Assert that Song Collection is equals to Song Collection Size : 4
		assertEquals(4,testSc.size());
		//Act
		sc.addSong(s1);
		//Assert that Song Collection is equals to Song Collection Size + 1 : 5
		assertEquals(5,testSc.size());
		
		for (int i=0;i<16;i++)
		{
			sc.addSong(s5);	
		}
		//hit 20 already and will not be added
		System.out.println ( "length now " + testSc.size() );
		assertEquals(20,testSc.size());
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven.eclipse.SongCollection#sortSongsBySongLength()}.
	 */
	@Test
	void testSortSongsBySongLength() {
		//fail("Not yet implemented");

		List <Song> sortedSongs = sc.sortSongsBySongLength() ; 
		System.out.println ( sortedSongs.get(0).getSongLength() );
		
		assertEquals(3.59,sortedSongs.get(0).getSongLength());
		/*
		 * s1 = new Song("001","good 4 u","Olivia Rodrigo",3.59); s2 = new
		 * Song("002","Peaches","Justin Bieber",3.18); s3 = new
		 * Song("003","MONTERO","Lil Nas",2.3); s4 = new
		 * Song("004","bad guy","billie eilish",3.14);
		 */
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven.eclipse.SongCollection#findSongsById(java.lang.String)}.
	 */
	@Test
	void testFindSongsById() {
		//fail("Not yet implemented");
		Song s6 = new Song("006","Xmen","Xmen2",3.99);
		sc.addSong(s6) ; 
		
		Song foundSong = sc.findSongsById("006");
		assertEquals("006",foundSong.getId());
		assertEquals("Xmen",foundSong.getTitle());
		assertEquals("Xmen2",foundSong.getArtiste());
		assertEquals(3.99,foundSong.getSongLength());
		
		//test fr song that is not found
		Song foundSong2 = sc.findSongsById("011");
		assertNull(foundSong2);
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven.eclipse.SongCollection#findSongByTitle(java.lang.String)}.
	 */
	@Test
	void testFindSongByTitle() {
		//fail("Not yet implemented");
		
		Song s7 = new Song("007","TitleBYMusic","Xmen2",3.99);
		sc.addSong(s7) ; 
		
		Song foundSong = sc.findSongByTitle("TitleBYMusic");
		assertEquals("007",foundSong.getId());
		assertEquals("TitleBYMusic",foundSong.getTitle());
		
		//assertEquals("Xmen2",foundSong.getArtiste());
		//assertEquals(3.99,foundSong.getSongLength());
		
		//test fr song that is not found
		Song foundSong2 = sc.findSongByTitle("011");
		assertNull(foundSong2);
		
		
	}
	
	/**
	 * Test method for {@link com.sddevops.junit_maven.eclipse.SongCollection#sortSongsByTitle(java.lang.String)}.
	 */
	@Test
	void testSortSongBySongTitle() {
		//fail("Not yet implemented");
		
		List <Song> sortedSongs = sc.sortSongsByTitle() ; 
		System.out.println ( sortedSongs.get(0).getTitle() );
		
		
		assertEquals("MONTERO",sortedSongs.get(0).getTitle());
		assertEquals("Peaches",sortedSongs.get(1).getTitle());
		
	}

}
