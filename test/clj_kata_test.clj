(ns clj-kata-test
  (:require
    [clojure.test :refer [deftest is]]
    [clojure.test.check.clojure-test :refer [defspec]]
    [clojure.test.check :as tc]
    [clojure.test.check.generators :as gen]
    [clojure.test.check.properties :as prop]
    [clj-kata :refer :all]))

(deftest equality-test
  (is (= 1 1)))

(defspec sort-prop
  1000
  (prop/for-all [v (gen/vector gen/nat)]
    (= (sort v) (sort (sort v)))))
