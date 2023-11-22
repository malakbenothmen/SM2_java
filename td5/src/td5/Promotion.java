package td5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public interface Promotion {
	public final LocalDate debutPromo = LocalDate.of(2022,3,19);
    public  final  LocalDate finPromo = LocalDate.of(2022,3,31);
  
float prixDeVente(String dateStr);

default boolean estPeriodePromo(String dateStr)
{ DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate dateAchat = LocalDate.parse(dateStr, formatter);
return (dateAchat.isEqual(debutPromo) || dateAchat.isAfter(debutPromo))
        && (dateAchat.isEqual(finPromo) || dateAchat.isBefore(finPromo));
}


public static double calculerRemise(double prixAvantRemise, double prixApresRemise)
{return (( prixAvantRemise - prixApresRemise) / prixAvantRemise) * 100;}
}