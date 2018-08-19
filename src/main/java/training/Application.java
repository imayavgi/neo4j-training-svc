package training;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableNeo4jRepositories
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    /*
    @Bean
    CommandLineRunner demo(OfferingRepository offeringRep, SkillRepository srep, RoleRepository rrep) {
        return args -> {

            offeringRep.deleteAll();
            srep.deleteAll();
            rrep.deleteAll();

            Offering s3 = new Offering("S3_TRAINING", "s3 Training", "VGI", "Web", "BASIC", "FIRST");

            offeringRep.save(s3);

            Offering savedS3 = offeringRep.findByTitle("S3_TRAINING");
            Role engg = new Role("SRE_ROLE", "Engineer", "Cloud Engg");
            Skill devSkill = new Skill("DEV_SKILL", "DEVOPS", "SYSENGG");
            Skill secSkill = new Skill("SECURITY_ADM", "DEVOPS", "SYSENGG");
            Skill admSkill = new Skill("SYS_ADM_SKILL", "DEVOPS", "SYSENGG");
            engg.needToHave(devSkill);
            engg.needToHave(secSkill);
            engg.needToHave(admSkill);
            savedS3.offeredFor(engg);
            offeringRep.save(savedS3);


            Offering saved2S3 = offeringRep.findByTitle("S3_TRAINING");
            Role arch = new Role("ARCH_ROLE", "Architect", "Cloud Architect");
            Skill arSkill = new Skill("ARCHITECT_SKILL", "DEVOPS", "ARCHITECT");
            saved2S3.offeredFor(arch);
            offeringRep.save(saved2S3);

            Role mgr = new Role("MGR_ROLE", "Manager", "Manager for Cloud");
            rrep.save(mgr);
            Role savedMgr = rrep.findByName("MGR_ROLE");
            Skill mgrSkill = new Skill("GENERAL_CLOUD_SKILL", "LEADERS", "LEADING");
            savedMgr.needToHave(mgrSkill);
            Offering saved3S3 = offeringRep.findByTitle("S3_TRAINING");
            saved3S3.offeredFor(savedMgr);
            offeringRep.save(saved3S3);
        };
    }
    */
}
