(require '[datahike.api :as d]
         '[sail.core :as sail])
(def cfg {:store {:backend :file :path "db.dh"}
          :schema-flexibility :read})
(d/create-database cfg)
(d/connect cfg)

