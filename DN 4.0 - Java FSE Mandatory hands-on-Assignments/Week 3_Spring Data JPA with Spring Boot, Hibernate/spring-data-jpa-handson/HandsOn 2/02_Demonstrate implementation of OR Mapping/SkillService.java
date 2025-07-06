@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Transactional
    public Skill get(int id) {
        return skillRepository.findById(id).get();
    }

    @Transactional
    public void save(Skill skill) {
        skillRepository.save(skill);
    }
}
