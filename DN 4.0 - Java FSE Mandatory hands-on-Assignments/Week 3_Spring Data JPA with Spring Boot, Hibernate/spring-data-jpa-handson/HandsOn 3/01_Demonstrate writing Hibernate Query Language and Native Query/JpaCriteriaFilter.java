@Component
public class JpaCriteriaFilter {

    @PersistenceContext private EntityManager em;

    public List<Product> filterProducts(Map<String, Object> filters) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Product> cq = cb.createQuery(Product.class);
        Root<Product> root = cq.from(Product.class);
        List<Predicate> preds = new ArrayList<>();

        filters.forEach((k,v)-> {
            switch (k) {
                case "minRam": preds.add(cb.ge(root.get("ram"), (Integer)v)); break;
                case "maxWeight": preds.add(cb.le(root.get("weight"), (Double)v)); break;
                case "os": preds.add(cb.equal(root.get("os"), v)); break;
                case "cpu": preds.add(cb.like(root.get("cpu"), "%" + v + "%")); break;
                case "minRating": preds.add(cb.ge(root.get("rating"), (Double)v)); break;
                case "minStorage": preds.add(cb.ge(root.get("storage"), (Integer)v)); break;
                case "minCpuSpeed": preds.add(cb.ge(root.get("cpuSpeed"), (Double)v)); break;
            }
        });

        cq.where(preds.toArray(new Predicate[0]));
        return em.createQuery(cq).getResultList();
    }
}
