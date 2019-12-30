(ns cme-compile.core-test
  (:require [clojure.test :refer :all]
            [cme-compile.core :refer :all]))

(deftest general-exclusion-test
  (testing "The general exclusion list should contain admin messages"
   (is (= general-exclusion #{12}))))

(deftest wtf
  (testing "The general weeks"
    (is (= 1 1))))
