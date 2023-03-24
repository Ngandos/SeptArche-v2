package fr.abbo.eArche.dao;

    import java.util.List;

    //Interface par defaut toutes les classes devrons implementer ses methodes

    public interface DAO <C, T> {

        public int save(C objet);

        public C findById(T id);

        public List<C> findAll();

        public int delete(T id);

        public int update(C objet);
    }