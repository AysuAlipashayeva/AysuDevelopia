package az.developia.librarianaysu.entity;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
 
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Double price;
	
	private Integer pageCount;
	
	private String author;
	

}
