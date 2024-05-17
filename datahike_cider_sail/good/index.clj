(require '[datahike.api :as d])
(def cfg {:store {:backend :file :path "db.dh"}
          :schema-flexibility :read})
(d/create-database cfg)
(d/connect cfg)
