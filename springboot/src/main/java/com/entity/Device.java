import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer batteryPower;
    private Boolean blue;
    private Double clockSpeed;
    private Boolean dualSim;
    private Integer fc;
    private Boolean fourG;
    private Integer intMemory;
    private Double mDep;
    private Integer mobileWt;
    private Integer nCores;
    private Integer pc;
    private Integer pxHeight;
    private Integer pxWidth;
    private Integer ram;
    private Integer scH;
    private Integer scW;
    private Integer talkTime;
    private Boolean threeG;
    private Boolean touchScreen;
    private Boolean wifi;
    private Integer priceRange;

}